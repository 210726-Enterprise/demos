import { CalculatorPipe } from './calculator.pipe';

describe('CalculatorPipe', () => {
  it('create an instance', () => {
    const pipe = new CalculatorPipe();
    expect(pipe).toBeTruthy();
  });
});
