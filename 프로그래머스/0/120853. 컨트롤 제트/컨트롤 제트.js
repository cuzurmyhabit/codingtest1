function solution(s) {
  let minus = 0;
  const arr = s.split(" ");

  for (let i = 0; i < arr.length; i++) {
    if (arr[i] == "Z") minus += Number(arr[i - 1]);
  }
  return arr.reduce((a, b) => (Number(b) ? a + Number(b) : a), 0) - minus;
}