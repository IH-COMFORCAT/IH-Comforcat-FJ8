import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { Fan } from 'src/app/models/fan';

@Component({
  selector: 'app-fan-card',
  templateUrl: './fan-card.component.html',
  styleUrls: ['./fan-card.component.css']
})
export class FanCardComponent implements OnInit {

  @Input()
  fan: Fan;
  @Input('fanIndex')
  index: number;

  @Output()
  fanDeleted = new EventEmitter<number>();

  constructor() {
    this.fan = new Fan('', 0, '');
    this.index = 0;
   }

  ngOnInit(): void {
  }

  getFanClass(): string {
    if (this.index % 2 == 0) {
      return 'even';
    } else {
      return 'odd';
    }
  }

  changeTeam(): void {

  }

  deleteFan():void {
    console.log("Deleting fan " + this.index);
    this.fanDeleted.emit(this.index);

  }

}
