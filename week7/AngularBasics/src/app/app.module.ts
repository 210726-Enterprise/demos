import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { HighlightedDirective } from './directives/highlighted.directive';
import { SecondComponent } from './components/second/second.component';
import { ThirdComponent } from './components/third/third.component';
import { CalculatorPipe } from './pipes/calculator.pipe';

@NgModule({
  declarations: [
    AppComponent,
    HighlightedDirective,
    SecondComponent,
    ThirdComponent,
    CalculatorPipe
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
