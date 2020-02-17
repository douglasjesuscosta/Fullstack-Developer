import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';

import { AppComponent } from './app.component';
import { LayoutModule } from './layout/layout.module';
import { AppRoutingModule } from './app-routing.module';

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    LayoutModule,
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
  ],
  providers: [
   /* {
    provide: HTTP_INTERCEPTORS,
    useClass: AppInterceptor,
    multi: true
  }*/
],
  bootstrap: [AppComponent],
  exports: [HttpClientModule]
})
export class AppModule { }
