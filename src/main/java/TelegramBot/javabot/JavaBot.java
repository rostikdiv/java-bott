package TelegramBot.javabot;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.GetFile;
import org.telegram.telegrambots.meta.api.methods.send.SendDocument;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.*;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;


@Component
public class JavaBot extends TelegramLongPollingBot {
    @Override
    public String getBotUsername() {
        return "first_184641_Bot";
    }

    @Override
    public String getBotToken() {
        return "7077397544:AAEOnq8dZISD7spd0zw7_RUaNi3RCwnA-v4";
    }
    ArrayList<MyClass> arrayList =new ArrayList<>();
    String param1="";
    int param2=0;
    double param3=0.0;
    boolean toCreateObject=false;
    boolean toinciateParam1=false;
    boolean toinciateParam2=false;
    boolean toinciateParam3=false;
    boolean sendFile=false;

    public synchronized void onUpdateReceived(Update update){
        output(update);
        Document document = new Document();
        SendDocument sendDocument = new SendDocument();
        update.getMessage().getDocument();
        update.getMessage();
        File file=new File();
        update.getMessage().hasDocument();
        
    }


    private synchronized void output(Update update){
        Message message=update.getMessage();
        SendMessage sendMessage=new SendMessage();
        if (message != null && message.getText() != null &&message.getText().equals("add object")){
            toCreateObject=true;
            toinciateParam1=true;
            toinciateParam2=true;
            toinciateParam3=true;
        }
        if (message != null && message.getText() != null && message.getText().equals("start")){
            sendMessage.setText("operations");
            sendMessage.setChatId(String.valueOf(message.getChatId()));
            System.out.println("1");
            sendMessage.setReplyMarkup(getKeyboard());
        } else if (message != null && message.getText() != null &&message.getText().equals("show chatId")){
            sendMessage.setText(String.valueOf(message.getChatId()));
            sendMessage.setChatId(String.valueOf(message.getChatId()));
            File file =new File();
            //file.
            System.out.println("_______________________________________________________________________________________");
            System.out.println("chatId  "+String.valueOf(message.getChatId()));
            System.out.println("_______________________________________________________________________________________");

        } else if (message != null && message.getText() != null &&message.getText().equals("sand")) {
            sendMessage.setText("--------------------------");
            sendMessage.setChatId("948760466");
            System.out.println("sanded message");

        } else if (message != null && message.getText() != null && message.getText().equals("show objects")) {
            sendMessage.setChatId(String.valueOf(message.getChatId()));
            System.out.println("7");
            System.out.println("size of list "+arrayList.size());
            if (arrayList.isEmpty()){
                sendMessage.setText("array is empty");
            } else {
                for (int i=0;i<=arrayList.size();i++){
                    sendMessage.setText("object number "+(i+1)+" "+arrayList.get(i).toString());
                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }
            }

        }else if (message != null && message.getText() != null && toCreateObject && message.getText().equals("add object")) {
            sendMessage.setText("please enter first parameter text");
            sendMessage.setChatId(String.valueOf(message.getChatId()));
            System.out.println("2");

            sendMessage.setReplyMarkup(getButtonToParam1());
        } else if (toCreateObject&&toinciateParam1) {
            sendMessage.setText("please enter second parameter integer number");
            System.out.println("3");
            sendMessage.setReplyMarkup(getButtonToParam2());

            if (update.hasCallbackQuery()){
                if (update.getCallbackQuery().getData().equals("AA0997BB")){
                    param1=update.getCallbackQuery().getData();
                } else if (update.getCallbackQuery().getData().equals("AB4544AC")) {
                    param1=update.getCallbackQuery().getData();
                }else if (update.getCallbackQuery().getData().equals("AI6556CC")) {
                    param1=update.getCallbackQuery().getData();
                }else if (update.getCallbackQuery().getData().equals("BC1010AA")) {
                    param1=update.getCallbackQuery().getData();
                }
                sendMessage.setChatId(String.valueOf(update.getCallbackQuery().getMessage().getChatId()));
            } else if (update.hasMessage()){
                param1=String.valueOf(message.getText());
                sendMessage.setChatId(String.valueOf(message.getChatId()));
            }

            toinciateParam1=false;
        } else if (toCreateObject&&toinciateParam2) {
            sendMessage.setText("please enter third parameter double number");
            System.out.println("4");
            sendMessage.setReplyMarkup(getButtonToParam3());

            if (update.hasCallbackQuery()){
                if (update.getCallbackQuery().getData().equals("546593")){
                    param2=Integer.parseInt(update.getCallbackQuery().getData());
                } else if (update.getCallbackQuery().getData().equals("424552")) {
                    param2=Integer.parseInt(update.getCallbackQuery().getData());
                }else if (update.getCallbackQuery().getData().equals("393524")) {
                    param2=Integer.parseInt(update.getCallbackQuery().getData());
                }else if (update.getCallbackQuery().getData().equals("394532")) {
                    param2=Integer.parseInt(update.getCallbackQuery().getData());
                }
                sendMessage.setChatId(String.valueOf(update.getCallbackQuery().getMessage().getChatId()));
            } else if (update.hasMessage()) {
                param2=Integer.parseInt(update.getMessage().getText());
                sendMessage.setChatId(String.valueOf(update.getMessage().getChatId()));
            }
            toinciateParam2=false;
        } else if (toCreateObject&&toinciateParam3) {
            System.out.println("5");

            if (update.hasCallbackQuery()){
                if (update.getCallbackQuery().getData().equals("3553.232")) {
                    param3 = Double.parseDouble(update.getCallbackQuery().getData());
                } else if (update.getCallbackQuery().getData().equals("47.272")) {
                    param3 = Double.parseDouble(update.getCallbackQuery().getData());
                } else if (update.getCallbackQuery().getData().equals("262.2622")) {
                    param3 = Double.parseDouble(update.getCallbackQuery().getData());
                } else if (update.getCallbackQuery().getData().equals("35.2223")) {
                    param3 = Double.parseDouble(update.getCallbackQuery().getData());

                }
                sendMessage.setChatId(String.valueOf(update.getCallbackQuery().getMessage().getChatId()));
            } else if (update.hasMessage()) {
                param3=Double.parseDouble(update.getMessage().getText());
                sendMessage.setChatId(String.valueOf(update.getMessage().getChatId()));
            }
            toinciateParam3 = false;
            MyClass myClass=new MyClass(param1,param2,param3);
            //arrayList.add(myClass);
            addToArrayList(myClass);
            param1="";
            param2=1;
            param3=0.0;
            toCreateObject=false;
            sendMessage.setText("this object "+myClass.toString()+" created and added to list");

        } else if (message != null && message.getText() != null &&update.getMessage().getText().equals("send file")) {
            sendMessage.setText("please send file");
            sendMessage.setChatId(String.valueOf(update.getMessage().getChatId()));
            sendFile=true;

        } else if (sendFile) {
            //SendDocument sendDocument=new SendDocument();
            //sendDocument.setDocument(update.getMessage().getDocument().getFileId());
            Document document = update.getMessage().getDocument();
            String fileId = document.getFileId();
            long chatId = update.getMessage().getChatId();

            SendDocument sendDocumentRequest = new SendDocument();
            sendDocumentRequest.setChatId(String.valueOf(chatId));

            // Встановлення fileId файлу для надсилання
            InputFile inputFile = new InputFile(fileId);
            sendDocumentRequest.setDocument(inputFile);

            try {
                // Відправка документа
                execute(sendDocumentRequest);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (update.hasMessage()){
            sendMessage.setText("you send incorrect message");
            sendMessage.setChatId(String.valueOf(update.getMessage().getChatId()));
            System.out.println("6");

        }


        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }


    }
    private ReplyKeyboardMarkup getKeyboard(){
        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);
        List<KeyboardRow> keyboardRows =new ArrayList<>();
        KeyboardRow keyboardRow1=new KeyboardRow();
        keyboardRow1.add("add object");
        KeyboardRow keyboardRow2=new KeyboardRow();
        keyboardRow2.add("show objects");
        KeyboardRow keyboardRow3=new KeyboardRow();
        keyboardRow2.add("show chatId");
        KeyboardRow keyboardRow4=new KeyboardRow();
        keyboardRow2.add("send file");

        keyboardRows.add(keyboardRow1);
        keyboardRows.add(keyboardRow2);
        keyboardRows.add(keyboardRow3);
        keyboardRows.add(keyboardRow4);



        replyKeyboardMarkup.setKeyboard(keyboardRows);

        return replyKeyboardMarkup;
    }
    private InlineKeyboardMarkup getButtonToParam1(){
        InlineKeyboardMarkup inlineKeyboardMarkup=new InlineKeyboardMarkup();
        List<InlineKeyboardButton> buttonRow1=new ArrayList<>();
        List<InlineKeyboardButton> buttonRow2=new ArrayList<>();
        List<List<InlineKeyboardButton>> buttonRows=new ArrayList<>();
        InlineKeyboardButton button1=new InlineKeyboardButton();
        button1.setText("AA0997BB");
        button1.setCallbackData("AA0997BB");
        InlineKeyboardButton button2=new InlineKeyboardButton();
        button2.setText("AB4544AC");
        button2.setCallbackData("AB4544AC");
        InlineKeyboardButton button3=new InlineKeyboardButton();
        button3.setText("AI6556CC");
        button3.setCallbackData("AI6556CC");
        InlineKeyboardButton button4=new InlineKeyboardButton();
        button4.setText("BC1010AA");
        button4.setCallbackData("BC1010AA");
        buttonRow1.add(button1);
        buttonRow1.add(button2);
        buttonRow2.add(button3);
        buttonRow2.add(button4);
        buttonRows.add(buttonRow1);
        buttonRows.add(buttonRow2);

        inlineKeyboardMarkup.setKeyboard(buttonRows);

        return inlineKeyboardMarkup;
    }
    private InlineKeyboardMarkup getButtonToParam2(){
        InlineKeyboardMarkup inlineKeyboardMarkup=new InlineKeyboardMarkup();
        List<InlineKeyboardButton> buttonRow1=new ArrayList<>();
        List<InlineKeyboardButton> buttonRow2=new ArrayList<>();
        List<List<InlineKeyboardButton>> buttonRows=new ArrayList<>();
        InlineKeyboardButton button1=new InlineKeyboardButton();
        button1.setText("546593");
        button1.setCallbackData("546593");
        InlineKeyboardButton button2=new InlineKeyboardButton();
        button2.setText("424552");
        button2.setCallbackData("424552");
        InlineKeyboardButton button3=new InlineKeyboardButton();
        button3.setText("393524");
        button3.setCallbackData("393524");
        InlineKeyboardButton button4=new InlineKeyboardButton();
        button4.setText("394532");
        button4.setCallbackData("394532");
        buttonRow1.add(button1);
        buttonRow1.add(button2);
        buttonRow2.add(button3);
        buttonRow2.add(button4);
        buttonRows.add(buttonRow1);
        buttonRows.add(buttonRow2);

        inlineKeyboardMarkup.setKeyboard(buttonRows);

        return inlineKeyboardMarkup;
    }
    private InlineKeyboardMarkup getButtonToParam3(){
        InlineKeyboardMarkup inlineKeyboardMarkup=new InlineKeyboardMarkup();
        List<InlineKeyboardButton> buttonRow1=new ArrayList<>();
        List<InlineKeyboardButton> buttonRow2=new ArrayList<>();
        List<List<InlineKeyboardButton>> buttonRows=new ArrayList<>();
        InlineKeyboardButton button1=new InlineKeyboardButton();
        button1.setText("3553.232");
        button1.setCallbackData("3553.232");
        InlineKeyboardButton button2=new InlineKeyboardButton();
        button2.setText("47.272");
        button2.setCallbackData("47.272");
        InlineKeyboardButton button3=new InlineKeyboardButton();
        button3.setText("262.2622");
        button3.setCallbackData("262.2622");
        InlineKeyboardButton button4=new InlineKeyboardButton();
        button4.setText("35.2223");
        button4.setCallbackData("35.2223");
        buttonRow1.add(button1);
        buttonRow1.add(button2);
        buttonRow2.add(button3);
        buttonRow2.add(button4);
        buttonRows.add(buttonRow1);
        buttonRows.add(buttonRow2);

        inlineKeyboardMarkup.setKeyboard(buttonRows);

        return inlineKeyboardMarkup;
    }
    private synchronized void addToArrayList(MyClass myClass) {
        arrayList.add(myClass);
    }

}





/*private ArrayList<MyClass> myList = new ArrayList<>();
    private String pendingParam1 = "";
    private int pendingParam2 = 0;
    private double pendingParam3 = 0.0;
    private boolean toCreateObject=false;

    @Override
    public void onUpdateReceived(Update update) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);

        if (update.hasMessage()) {
            Message message = update.getMessage();
            outputText(update, sendMessage, message);

        }

        if (update.hasCallbackQuery()) {
            outButton(update);
        }
    }

    private void sendResponse(String text, long chatId) {
        SendMessage message = new SendMessage();
        message.setChatId(String.valueOf(chatId));
        message.setText(text);
        try {
            execute(message);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    private void outputText(Update update, SendMessage sendMessage, Message message) {
        String messageText = message.getText().trim();
        long chatId=message.getChatId();
        if (message.getText().equals("Add object")) {
            toCreateObject = true;
        }

        if (update.hasMessage()) {

            sendMessage.setChatId(String.valueOf(update.getMessage().getChatId()));
            if (message.getText().equals("start")) {
                sendMessage.setReplyMarkup(getMenuKeyboard());
                sendMessage.setText("Button");
                sendMessage.setChatId(String.valueOf(update.getMessage().getChatId()));
                try {
                    execute(sendMessage);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            } else if (message.getText().equals("Button")) {
                sendMessage.setReplyMarkup(getTextButton());
                sendMessage.setText("Button");
                sendMessage.setChatId(String.valueOf(update.getMessage().getChatId()));
                try {
                    execute(sendMessage);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
            else if (message.getText().equals("Add object") && toCreateObject || update.hasCallbackQuery()) {
                sendMessage.setText("Введіть параметр 1 (текстова змінна)");
                sendMessage.setChatId(String.valueOf(chatId));
                sendMessage.setReplyMarkup(getTextButtonToCreateObjectParametr1());
                try {
                    execute(sendMessage);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
            else if (pendingParam1.isEmpty()&&toCreateObject|| (pendingParam1.isEmpty() && (update.getCallbackQuery().getData().equals("BC4224CC") || update.getCallbackQuery().getData().equals("AX0001AA") || update.getCallbackQuery().getData().equals("AA0232AB") || update.getCallbackQuery().getData().equals("AI2355AD")))) {
                sendMessage.setText("Введіть параметр 2 (ціле число):");
                sendMessage.setChatId(String.valueOf(chatId));
                if (update.hasCallbackQuery()){
                    outButtonToIniciateFirstParameter(update);
                } else {
                    pendingParam1 = messageText;
                }
                try {
                    execute(sendMessage);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
                } else if (pendingParam2 == 0&&toCreateObject) {
                    try {
                        pendingParam2 = Integer.parseInt(messageText);
                        sendMessage.setText("Введіть параметр 3 (дробове число):");
                        sendMessage.setChatId(String.valueOf(chatId));
                        try {
                            execute(sendMessage);
                        } catch (TelegramApiException e) {
                            e.printStackTrace();
                        }
                    } catch (NumberFormatException e) {
                        sendResponse("Некоректний формат числа. Введіть ціле число:",chatId);
                    }
                } else if (pendingParam3 == 0.0&&toCreateObject) {
                    try {
                        pendingParam3 = Double.parseDouble(messageText);
                        // Створення об'єкта MyClass та додавання його до ArrayList
                        MyClass newObj = new MyClass(pendingParam1, pendingParam2, pendingParam3);
                        myList.add(newObj);
                        // Очистка параметрів для наступного об'єкта
                        pendingParam1 = "";
                        pendingParam2 = 0;
                        pendingParam3 = 0.0;
                        sendMessage.setText("Об'єкт додано до списку: " + newObj.toString());
                        sendMessage.setChatId(String.valueOf(chatId));
                        toCreateObject=false;
                        try {
                            execute(sendMessage);
                        } catch (TelegramApiException e) {
                            e.printStackTrace();
                        }
                    } catch (NumberFormatException e) {
                        sendResponse("Некоректний формат числа. Введіть дробове число:",chatId);
                    }
                }else {

                sendResponse("you sand incorect msessage",chatId);
            }







        }
    }

    private void outButton(Update update) {
        CallbackQuery callbackQuery = update.getCallbackQuery();
        String data = callbackQuery.getData();
        long chatId=update.getMessage().getChatId();

        if (data.equals("First_action")) {
            sendResponse("Кнопку 1 нажато",chatId);
        } else if (data.equals("Second_action")) {
            sendResponse("Кнопку 2 нажато",chatId);
        } else if (data.equals("Third_action")) {
            sendResponse("Кнопку 3 нажато",chatId);
        } else if (data.equals("Fourth_action")) {
            sendResponse("Кнопку 4 нажато",chatId);
        }

    }


    private InlineKeyboardMarkup getTextButton() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        List<List<InlineKeyboardButton>> rows = new ArrayList<>();
        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("1");
        button1.setCallbackData("First_action");
        row1.add(button1);
        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("2");
        button2.setCallbackData("Second_action");
        row1.add(button2);
        rows.add(row1);
        InlineKeyboardButton button3 = new InlineKeyboardButton();
        button3.setText("3");
        button3.setCallbackData("Third_action");
        row2.add(button3);
        InlineKeyboardButton button4 = new InlineKeyboardButton();
        button4.setText("4");
        button4.setCallbackData("Fourth_action");
        row2.add(button4);
        rows.add(row2);
        inlineKeyboardMarkup.setKeyboard(rows);
        return inlineKeyboardMarkup;
    }
    private InlineKeyboardMarkup getTextButtonToCreateObjectParametr1() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        List<List<InlineKeyboardButton>> rows = new ArrayList<>();
        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("AA0232AB");
        button1.setCallbackData("AA0232AB");
        row1.add(button1);
        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("BC4224CC");
        button2.setCallbackData("BC4224CC");
        row1.add(button2);
        rows.add(row1);
        InlineKeyboardButton button3 = new InlineKeyboardButton();
        button3.setText("AX0001AA");
        button3.setCallbackData("AX0001AA");
        row2.add(button3);
        InlineKeyboardButton button4 = new InlineKeyboardButton();
        button4.setText("AI2355AD");
        button4.setCallbackData("AI2355AD");
        row2.add(button4);
        rows.add(row2);
        inlineKeyboardMarkup.setKeyboard(rows);
        return inlineKeyboardMarkup;
    }
    private void outButtonToIniciateFirstParameter(Update update) {
        if(pendingParam1==""){
            CallbackQuery callbackQuery = update.getCallbackQuery();
            String data = callbackQuery.getData();
            if (data.equals("AA0232AB")) {
                pendingParam1="AA0232AB";
            } else if (data.equals("BC4224CC")) {
                pendingParam1="BC4224CC";

            } else if (data.equals("AX0001AA")) {
                pendingParam1="AX0001AA";

            } else if (data.equals("AI2355AD")) {
                pendingParam1="AI2355AD";

            }
        }

    }

    private ReplyKeyboardMarkup getMenuKeyboard() {
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);

        List<KeyboardRow> keyboardRows = new ArrayList<>();
        KeyboardRow keyboardRow1 = new KeyboardRow();
        keyboardRow1.add("Button");
        keyboardRow1.add("Add object");
        KeyboardRow keyboardRow2 = new KeyboardRow();
        keyboardRow2.add("forthButton");
        keyboardRow2.add("fifthButton");
        keyboardRows.add(keyboardRow1);
        keyboardRows.add(keyboardRow2);
        replyKeyboardMarkup.setKeyboard(keyboardRows);
        return replyKeyboardMarkup;
    }*/











