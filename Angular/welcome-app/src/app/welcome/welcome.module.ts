import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { welcomeComponent } from './welcome.component';
import { studentComponent } from '../student/student.component';

@NgModule({
  declarations: [
    welcomeComponent,
    studentComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [welcomeComponent]
})
export class welcomeModule { }
