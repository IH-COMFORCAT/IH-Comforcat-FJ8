import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-exercise',
  templateUrl: './exercise.component.html',
  styleUrls: ['./exercise.component.css']
})
export class ExerciseComponent implements OnInit {

  webpageName: string;
  input: string;
  placeholder: string;
  fontSize: number;
  shoppingList: string[];

  constructor() {
    this.webpageName = "Ironhack's website";
    this.input = "";
    this.placeholder = "Introduce el texto";
    this.fontSize = 16;
    this.shoppingList = ['Milk', 'Sugar', 'Potatoes'];
  }

  ngOnInit(): void {
  }

  showText(): void {
    console.log(this.input);
  }

  getUserName(): void {
    console.log("Hola");
  }

  increaseSize(): void {
    this.fontSize += 2;
  }

  decreaseSize(): void {
    if (this.fontSize > 0) this.fontSize -= 2;
  }

  changeSize(value: string): void {
    if (value == '+') {
      this.fontSize += 2;
    } else {
      if (this.fontSize > 0) this.fontSize -= 2;
    }
  }

  checkIfTextTooBig() {

    if (this.input.length > 15) {
      alert("Cuidado, tu texto tiene más de 15 caracteres");
    } else {
      console.log(this.input.length);
    }

  }

  getColor(): string {
    if (this.input.length < 5) {
      return "#F45B69";
    } else if (this.input.length < 10) {
      return "#586A6A";
    } else {
      return "#2BD9FE";
    }
  }

  addElementToShoppingList() {
    this.shoppingList.push(this.input);
  }

}
