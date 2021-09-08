import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-second',
  templateUrl: './second.component.html',
  styleUrls: ['./second.component.css']
})
export class SecondComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
    setInterval(() => {
      this.currentTime = Date.now();
    }, 1);
  }

  money: number;
  currencyType: string = 'EUR';

  time: number;
  currentTime: number;

  num1: number = 0;
  num2: number = 0;

  data: string = "";
  op: string;

}
