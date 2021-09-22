export function sumArr(args: number[]) {
  return args.reduce((prev, curr) => (prev += curr));
}

export function sumArg(...args: number[]) {
  return args.reduce((prev, curr) => prev + curr);
}

export function hello(name: string) {
  return `Hello ${name} from Angular!!!`;
}
