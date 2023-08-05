import { Component } from '@angular/core';

@Component({
  selector: 'app-two-way',
/*  templateUrl: './two-way.component.html',
  styleUrls: ['./two-way.component.css']*/
  template:`
  <input [(ngModel)] = "userName" type = "text">
  {{userName}}
  `
})
export class TwoWayComponent {
public userName = "all       of you";
}
