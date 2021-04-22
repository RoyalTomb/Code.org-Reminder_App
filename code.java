var textList = [];
var index = 0;
updateScreen();
onEvent("addButton", "click", function( ) {
  appendItem(textList, getText("reminderInput"));
  setProperty("reminderInput", "text", "");
  updateScreen();
});
onEvent("leftButton", "click", function( ) {
  if (index > 0) {
    index = index - 1;
    updateScreen();
  }
});
onEvent("rightButton", "click", function( ) {
  if (index < textList.length - 1) {
    index = index + 1;
    updateScreen();
  }
});

function updateScreen() {
  if (textList.length < 1) {
    setProperty("reminderOutput", "text", "Add Reminders");
  } else {
    setProperty("countOutput", "text", index + 1);
    setProperty("reminderOutput", "text", textList[index]);
  }
}

