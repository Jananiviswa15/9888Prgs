import { Component } from '@angular/core';

@Component({
  selector: '[app-test-component]',
 /* templateUrl: './test-component.component.html',*/
 template : `<div> hi all of you </div>
 <h2> heading2 </h2>
 <span> {{name}}</span>
<p> {{10+10}}</p>
 <div> {{"hello"+  name}}</div>
 <p> {{name.length}}</p>
 <p> {{name.toUpperCase()}} </p>
 <section>{{ sayHi()}}</section>
 <p> {{siteUrl}} </p>
 `,
 styles: ['div { color: red; }']
})
export class TestComponentComponent {

  public name = 'JanaNN'; 
  

  public siteUrl = window.location.href;
  sayHi(){
    return this.name.toLowerCase();
  }
}
