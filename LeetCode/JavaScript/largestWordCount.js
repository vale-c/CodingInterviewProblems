/**
 * @param {string[]} messages
 * @param {string[]} senders
 * @return {string}
 */
var largestWordCount = function(messages, senders) {
    let map = new Map();

    for (let i = 0; i < messages.length; i++) {
        // Get the number of words contained in the  current message
        let wordCount = messages[i].split(' ').length;
        // Check if the sender already exists in the map
        let currentCount = map.get(senders[i]) || 0;
        // Update the sender's word count
        map.set(senders[i], currentCount + wordCount);
    }

    // Now, find the sender with the largest word count
    let maxWordCount = 0;
    let largestSender = '';
    
    for (let [sender, count] of map) {
        if (count > maxWordCount || (count === maxWordCount && sender > largestSender)) {
            maxWordCount = count;
            largestSender = sender;
        }
    }

    return largestSender;
};
