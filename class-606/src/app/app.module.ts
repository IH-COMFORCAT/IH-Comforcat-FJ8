import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FanListComponent } from './components/fan-list/fan-list.component';
import { FanCardComponent } from './components/fan-card/fan-card.component';

@NgModule({
  declarations: [
    AppComponent,
    FanListComponent,
    FanCardComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
