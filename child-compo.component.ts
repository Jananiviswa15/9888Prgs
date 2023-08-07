import { Component, EventEmitter, Output } from '@angular/core';
import { Input } from '@angular/core';
@Component({
  selector: 'app-child-compo',
  templateUrl: './child-compo.component.html',
  styleUrls: ['./child-compo.component.css']
})
export class ChildCompoComponent {
 // @Input() item : string = "";

  @Output()  newItemEvent = new EventEmitter<string>();

  addItem(value : string){
    this.newItemEvent.emit(value);  //waiting
  }
}
