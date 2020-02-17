

import { Injectable } from '@angular/core';
import { HttpRequest, HttpHandler, HttpEvent, HttpInterceptor, HttpErrorResponse } from '@angular/common/http';

import { catchError } from 'rxjs/operators';
import { Observable, throwError } from 'rxjs';

/**
 * Implementação responsável por interceptar as requisições Http.
 */
@Injectable()
export class AppInterceptor implements HttpInterceptor {

    /**
     * Construtor da classe.
     */
    constructor() { }

    /**
     * Método responsável por interceptar a requisição Http.
     * 
     * @param request 
     * @param next 
     */
    intercept(request: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>> {

        let token: string = "";

        request = request.clone({
            setHeaders: {
                "Access-Control-Allow-Origin": "*",
                "Content-Type": "application/json"
            }
        });


        return next.handle(request).pipe(
            catchError((err: HttpErrorResponse) => {
                if (err.status !== 401) {
                    return throwError(err);
                }
            })
        );
    }
}