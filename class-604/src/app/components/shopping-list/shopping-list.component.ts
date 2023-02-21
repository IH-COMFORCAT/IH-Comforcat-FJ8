import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-shopping-list',
  templateUrl: './shopping-list.component.html',
  styleUrls: ['./shopping-list.component.css']
})
export class ShoppingListComponent implements OnInit {

  shoppingElements: string[];
  input: string;

  constructor() {
    this.shoppingElements = [];
    this.input = "";
   }

  ngOnInit(): void {
  }

  addToShoppingList(): void {
    this.shoppingElements.push(this.input);
    this.input = "";
  }

  deleteItem(position: number) {
    this.shoppingElements.splice(position, 1);
  }

  getStyle(index: number) {
    if(index %2 ==0) {
      return "even";
    } else {
      return "odd";
    }
  }

}
