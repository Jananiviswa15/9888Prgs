import { Component } from '@angular/core';

@Component({
  selector: 'app-directive-compo',
/*  templateUrl: './directive-compo.component.html',
  styleUrls: ['./directive-compo.component.css']*/
  template : `
  <!-- <p  *ngIf = "displayName; then thenBlock  else elseBlock">
    {{name}} </p>


    <ng-template #thenBlock>
    </ng-template>
    <ng-template #elseBlock>
      <p>
if fails I will work

</p>
    </ng-template> -->

   <!-- <div [ngSwitch]="day">
      <p *ngSwitchCase="'mon'"> say it monday </p>
      <p *ngSwitchCase="'tue'"> say it tuesday </p>
     <p *ngSwitchCase="'wed'"> say it wednesday </p>
     <p *ngSwitchDefault> it is weekend</p>


</div> -->
<!--
<div *ngFor = "let val of colors; index as ind; first as fi; last as la">
<p>{{ind}} {{val}}  {{fi}} {{la}}</p> -->


<div *ngFor = "let val of colors; even as ev; odd as o">
<p>{{ev}}  {{val}} {{o}}</p>

</div>

  `
})
export class DirectiveCompoComponent {
name = "students";
  displayName = false;

  public day = "mon";

  public colors = ["red", "blue", "orange", "green"];


}
