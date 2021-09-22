import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-vote',
  templateUrl: './vote.component.html',
  styleUrls: ['./vote.component.css'],
})
export class VoteComponent implements OnInit {
  voteCount: number = 0;

  constructor() {}

  ngOnInit(): void {}

  upVote() {
    this.voteCount++;
  }

  downVote() {
    this.voteCount--;
  }
}
