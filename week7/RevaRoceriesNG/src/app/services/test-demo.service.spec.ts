import { sumArg, sumArr, hello } from './test-demo.service';

describe('Test-demo services tests', () => {
  // describe describes a test suite to be run by the test runner. It can contain multiple tests
  it('should return 10 when given 5 and 5 as parameters', () => {
    // 'it' denotes a single unit of testing. i.e. a test case
    let result = sumArg(5, 5);
    expect(result).toBe(10);
  });

  it('should return 15 when given 5 and 5 and 5 as parameters', () => {
    // 'it' denotes a single unit of testing. i.e. a test case
    let result = sumArg(5, 5, 5);
    expect(result).toBe(15);
  });

  it('should return 15 when given an array of three 5s as a parameter', () => {
    let arr = [5, 5, 5];
    expect(sumArr(arr)).toBe(15);
  });

  it('should return Hello Brandon from Karma/Jasmine!!! when given Brandon', () => {
    expect(hello('Brandon'));
  });
});
