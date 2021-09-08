import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'My Angular Basics';

  hello: string = "Hello World";
  website: string = "https://www.google.com/";
  url: string;
  endpoint: string;
  showParagraph: boolean = false;
  marioCharacters: Array<string> = ["Mario", "Luigi", "Yoshi", "Peach", "Daisy", "Toad"];
  newCharacter: string = "";

  testFunction() {
    console.log("Tested calling a function");
    this.hello += " to Everyone!"
  }

  saySomething() {
    this.hello = (this.hello == "Hello World") ? "Goodbyte World" : "Hello World";
  }

  changeWebsite() {
    this.website = (this.website == "https://www.google.com/") ? "https://www.espn.com/" : "https://www.google.com/"
  }

  setEndpoint() {
    this.endpoint = "http://www." + this.url + ".com/";
  }

  setURL() {
    this.url = "google";
    this.setEndpoint();
  }

  showText() {
    this.showParagraph = !this.showParagraph;
  }

  addCharacter() {
    this.marioCharacters.push(this.newCharacter);
    this.clearText();
  }

  clearText() {
    this.newCharacter = "";
  }

  removeCharacter() {
    this.marioCharacters.pop();
  }

  deleteCharacter(character: string) {

    let index: number = this.marioCharacters.indexOf(character);

    if (index > -1) {
      this.marioCharacters.splice(index, 1);
    }

  }


}
