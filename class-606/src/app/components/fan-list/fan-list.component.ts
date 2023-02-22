import { Component, OnInit } from '@angular/core';
import { Fan } from 'src/app/models/fan';

@Component({
  selector: 'app-fan-list',
  templateUrl: './fan-list.component.html',
  styleUrls: ['./fan-list.component.css']
})
export class FanListComponent implements OnInit {

  fanName: string;
  fanAge!:number;
  fanCountry: string;
  fanTeam: string;

  madridFanList: Fan[];
  barcelonaFanList: Fan[];

  constructor() {

    this.fanName = '';
    ;
    this.fanCountry = '';
    this.fanTeam = '';

    this.madridFanList = [];
    this.barcelonaFanList = [];

   }

  ngOnInit(): void {
    this.madridFanList.push(new Fan("John Doe", 30, "United States"));
    this.madridFanList.push(new Fan("Manuel García", 30, "Spain"));
    this.madridFanList.push(new Fan("Lucia Martin ", 25, "Spain"));

    this.barcelonaFanList.push(new Fan("Maite Cardozo", 33, "Venezuela"));
    this.barcelonaFanList.push(new Fan("Cesar Bianco", 31, "Italy"));
    this.barcelonaFanList.push(new Fan("Akira Yamaoka", 38, "Japan"));
  }

  addFan(): void {
    let fan: Fan = new Fan(this.fanName, this.fanAge, this.fanCountry);

    if (this.fanTeam == 'madrid') {
      this.madridFanList.push(fan);
    } else {
      this.barcelonaFanList.push(fan);
    }

    this.fanName = '';
    this.fanAge = 0;
    this.fanCountry = '';

  }



  changeTeam(index:number, team:string):void {

    if (team == 'madrid') {
      this.barcelonaFanList.push(this.madridFanList[index]);
      this.madridFanList.splice(index, 1);
    } else {
      this.madridFanList.push(this.barcelonaFanList[index]);
      this.barcelonaFanList.splice(index, 1);
    }
  }

  deleteFan(index:number, team:string): void {
    if (team == 'madrid') {
      this.madridFanList.splice(index, 1);
    } else {
      this.barcelonaFanList.splice(index, 1);
    }
  }

}
