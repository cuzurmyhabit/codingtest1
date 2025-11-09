function solution(friends, gifts) {
    var answer = 0;

    let friendsCnt = friends.length;
    let recordsArray = [];      
    let pointsArray = [];  
    let nextGifts = new Array(friendsCnt).fill(0);    

    friends.reduce((acc, friend, idx) => {
        (arr = []).length = friendsCnt;
        arr.fill(0);
        recordsArray.push(arr);
        
        pointsArray.push({
            name: friend,
            gives: 0,
            takes: 0,
            points: 0
        });
        
    }, 0);

    gifts.reduce((acc, gift, idx) => {
        let [giver, taker] = gift.split(' ');
        let giverIdx = pointsArray.findIndex(({name}) => giver === name);
        let takerIdx = pointsArray.findIndex(({name}) => taker === name);
        recordsArray[giverIdx][takerIdx]++;
        pointsArray[giverIdx].gives++;
        pointsArray[giverIdx].points++;
        pointsArray[takerIdx].takes++;
        pointsArray[takerIdx].points--;
    }, 0);
    // console.log("recordsArray=%o",recordsArray);
    // console.log("pointsArray=%o",pointsArray);    

    for(let i=0; i<friendsCnt-1; i++) {
        for(let j=i+1; j<friendsCnt; j++) {
            if(recordsArray[i][j] > recordsArray[j][i]){
                nextGifts[i]++;
            }
            else if(recordsArray[i][j] < recordsArray[j][i]){
                nextGifts[j]++;
            }
            else if((recordsArray[i][j]==0 && recordsArray[j][i]==0) || recordsArray[i][j] == recordsArray[j][i]) {
                if(pointsArray[i].points > pointsArray[j].points){
                    nextGifts[i]++;
                }
                else if(pointsArray[i].points < pointsArray[j].points){
                    nextGifts[j]++;
                }
            }
        }
    }
    // console.log(nextGifts);
    answer = Math.max.apply(null, nextGifts);
    
    return answer;
}