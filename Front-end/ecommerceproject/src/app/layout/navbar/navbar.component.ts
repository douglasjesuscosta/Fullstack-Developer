import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {
  
  public showSubMenu = false;

  constructor() { }

  ngOnInit() {
  }

  onMouseEnter = () => {
    this.showSubMenu = true;
  }

}
