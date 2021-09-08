import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'calculator'
})
export class CalculatorPipe implements PipeTransform {

  // transform(data: number, num1: number, num2: number): string {
  //   return num1 + " + " + num2 + " = " + (num1 + num2);
  // }

  transform(data: any, op: string): string {

    switch (op) {
      case "+": {
        return data.number1 + " + " + data.number2 + " = " + (data.number1 + data.number2);
      }
      case "-": {
        return data.number1 + " - " + data.number2 + " = " + (data.number1 - data.number2);
      }
      case "*": {
        return data.number1 + " * " + data.number2 + " = " + (data.number1 * data.number2);
      }
      case "/": {
        return data.number1 + " / " + data.number2 + " = " + (data.number1 / data.number2);
      }
      case "%": {
        return data.number1 + " % " + data.number2 + " = " + (data.number1 % data.number2);
      }

      default: {
        return data.number1 + " + " + data.number2 + " = " + (data.number1 + data.number2);
      }
    }


  }

}
