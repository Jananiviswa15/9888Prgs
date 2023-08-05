import { Component } from '@angular/core';
import { bufferTime } from 'rxjs';

@Component({
  selector: 'app-property-binding-compo',
  //templateUrl: './property-binding-compo.component.html',
  //styleUrls: ['./property-binding-compo.component.css']
  template : `<h1> property binding </h1>
<div> <img [src] = "imageSrc"></div>
<input [disabled]="value" type = "text" value = "hello"/>
<button (dblclick)="sayhi()">Say Hi </button>
{{greetMsg}}
`
})
export class PropertyBindingCompoComponent {

  public imageSrc = "assets/icecream.jpeg";
public greetMsg = "";
  public value = true;

  sayhi(){
    console.log("hello");
    this.greetMsg = "hello learners";
  }

}
