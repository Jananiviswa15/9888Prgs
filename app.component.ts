import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'COMPANY DETAILS';
  passValueToCHild = 'AC';

  items = ['tv', 'AC'];

  addItem(newItem : string){
    this.items.push(newItem);
    console.log(this.items);
  }
}
