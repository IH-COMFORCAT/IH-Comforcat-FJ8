import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-main-page',
  templateUrl: './main-page.component.html',
  styleUrls: ['./main-page.component.css']
})
export class MainPageComponent implements OnInit {

  storeName: string = 'Pet shop';
  formattedDate: string;
  isDisabled: boolean;
  inputPlaceholder: string;
  input: string;
  color: string;

  constructor() {
    this.formattedDate = new Date().toLocaleDateString("es");
    this.isDisabled = true;
    this.inputPlaceholder = "Introduce tu texto aquí";
    this.input = "";
    this.color = "red";

   }

  ngOnInit(): void {
  }

  onCopy(event: string) {

    if(event == 'enable') {
      this.isDisabled = false;

    } else {
      this.isDisabled = true;
    }


  }

  alertMe() {
    alert("Has pulsado el botón de alerta");
  }

  alertInnerText() {
    alert(this.input);
  }

  getColor():string {
    if(this.isDisabled) {
      return 'red';
    } else {
      return 'green';
    }
  }

}
