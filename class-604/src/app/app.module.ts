import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MainPageComponent } from './components/main-page/main-page.component';
import { ExerciseComponent } from './components/exercise/exercise.component';
import { ShoppingListComponent } from './components/shopping-list/shopping-list.component';


@NgModule({
  declarations: [
    AppComponent,
    MainPageComponent,
    ExerciseComponent,
    ShoppingListComponent
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
