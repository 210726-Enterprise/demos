import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/models/User';
import { UserHttpService } from '../../services/user-http.service';

@Component({
  selector: 'app-user-page',
  templateUrl: './user-page.component.html',
  styleUrls: ['./user-page.component.css'],
})
export class UserPageComponent implements OnInit {
  constructor(private userHttp: UserHttpService) {}

  ngOnInit(): void {
    this.populateUserList();
  }

  fakeUserList: Array<any> = [
    {
      userId: 1,
      username: 'user1',
      password: 'pass1',
      firstName: 'Ryan',
      lastName: 'Schlientz',
      email: 'ryan@email.com',
    },
    {
      userId: 2,
      username: 'user2',
      password: 'pass2',
      firstName: 'Brandon',
      lastName: 'Pinkerton',
      email: 'brandon@email.com',
    },
  ];

  userList: User[] = [];

  username: string;
  password: string;
  firstName: string;
  lastName: string;
  email: string;

  populateUserList() {
    this.userHttp.getAllUsers().subscribe((response) => {
      console.log(response);
      this.userList = response;
    });
  }

  addUser() {
    console.log(this.username);
    console.log(this.password);
    console.log(this.firstName);
    console.log(this.lastName);
    console.log(this.email);

    let u: User = new User(
      0,
      this.username,
      this.password,
      this.firstName,
      this.lastName,
      this.email
    );

    this.userHttp.addUser(u).subscribe(
      (response) => {
        console.log(response);
        this.userList.push(response);
      },
      (response) => {
        console.log(response);
        console.log('Failed to add User');
      },
      () => {
        this.resetValues();
      }
    );
  }
  resetValues() {
    this.username = '';
    this.password = '';
    this.firstName = '';
    this.lastName = '';
    this.email = '';
  }
}
