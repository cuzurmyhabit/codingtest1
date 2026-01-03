function solution(n, t, m, p) {
  let answer = '';
  let sequence = '';
  let num = 0;

  while (answer.length < t) {
    sequence += num.toString(n).toUpperCase();
    num++;

    while (sequence.length > 0 && answer.length < t) {
      const index = answer.length * m + (p - 1);

      if (index < sequence.length) {
        answer += sequence[index];
      } else {
        break;
      }
    }
  }

  return answer;
}
