function solution(numbers) {
    const n = numbers.length;
    const answer = new Array(n).fill(-1);
    const stack = []; // 인덱스를 저장하는 스택

    for (let i = 0; i < n; i++) {
        // 현재 숫자가 스택 top이 가리키는 숫자보다 크면
        while (stack.length > 0 && numbers[stack[stack.length - 1]] < numbers[i]) {
            const idx = stack.pop();
            answer[idx] = numbers[i];
        }
        stack.push(i);
    }

    return answer;
}
