function reverseWordsInSentence(sentence) {
  const words = sentence.split(" ");
  const reversedWords = words.map((word) => reverseWord(word));
  return reversedWords.join(" ");
}

function reverseWord(word) {
  return word.split("").reverse().join("");
}

// Example usage:
const inputSentence = "Cloud Vandana";
const reversedSentence = reverseWordsInSentence(inputSentence);
console.log("Reversed sentence:", reversedSentence);
