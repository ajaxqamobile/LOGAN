package com.ajax.AjaxBotHelper.functions.email_reader;//package com.ajax.AjaxBotHelper.functions.email_reader;
//
//import org.springframework.data.repository.query.parser.Part;
//
//import javax.mail.*;
//import javax.mail.internet.MimeBodyPart;
//import java.io.*;
//import java.util.Date;
//import java.util.Properties;
//import java.util.logging.Logger;
//
//
//public  class FetchingEmail {
//
//
//
//        private static String saveDirectory = "/home/content"; // directory to save the downloaded documents
//
//        /**
//         * Sets the directory where attached files will be stored.
//         * @param dir absolute path of the directory
//         */
//        public void setSaveDirectory(String dir) {
//            EmailAttachmentReceiver.saveDirectory = dir;
//        }
//
//        /**
//         * Downloads new messages and saves attachments to disk if any.
//         * @param host
//         * @param port
//         * @param userName
//         * @param password
//         */
//        public static void downloadEmailAttachments(String host, String port, String userName, String password) {
//            Properties properties = new Properties();
//
//            // server setting
//            properties.put("mail.pop3.host", host);
//            properties.put("mail.pop3.port", port);
//
//            // SSL setting
//            properties.setProperty("mail.pop3.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
//            properties.setProperty("mail.pop3.socketFactory.fallback", "false");
//            properties.setProperty("mail.pop3.socketFactory.port", String.valueOf(port));
//
//            Session session = Session.getDefaultInstance(properties);
//
//            try {
//                // connects to the message store
//                Store store = session.getStore("pop3");
//                store.connect(userName, password);
//
//                // opens the inbox folder
//                Folder folderInbox = store.getFolder("INBOX");
//                folderInbox.open(Folder.READ_ONLY);
//
//                // fetches new messages from server
//                Message[] arrayMessages = folderInbox.getMessages();
//
//                for (int i = 0; i < arrayMessages.length; i++) {
//                    Message message = arrayMessages[i];
//                    Address[] fromAddress = message.getFrom();
//				/*String from = fromAddress[0].toString();
//				String subject = message.getSubject();
//				String sentDate = message.getSentDate().toString();*/
//
//                    String contentType = message.getContentType();
//                    String messageContent = "";
//
//                    // store attachment file name, separated by comma
//                    String attachFiles = "";
//
//                    if (contentType.contains("multipart")) {
//                        // content may contain attachments
//                        Multipart multiPart = (Multipart) message.getContent();
//                        int numberOfParts = multiPart.getCount();
//                        for (int partCount = 0; partCount < numberOfParts; partCount++) {
//                            MimeBodyPart part = (MimeBodyPart) multiPart.getBodyPart(partCount);
//                            if (Part.ATTACHMENT.equalsIgnoreCase(part.getDisposition())) {
//                                // this part is attachment
//                                String fileName = part.getFileName();
//                                attachFiles += fileName + ", ";
//                                part.saveFile(saveDirectory + File.separator + fileName);
//                            } else {
//                                // this part may be the message content
//                                messageContent = part.getContent().toString();
//                            }
//                        }
//
//                        if (attachFiles.length() > 1) {
//                            attachFiles = attachFiles.substring(0, attachFiles.length() - 2);
//                        }
//                    } else if (contentType.contains("text/plain") || contentType.contains("text/html")) {
//                        Object content = message.getContent();
//                        if (content != null) {
//                            messageContent = content.toString();
//                        }
//                    }
//
//				/*print out details of each message
//				System.out.println("Message #" + (i + 1) + ":");
//				System.out.println("\t From: " + from);
//				System.out.println("\t Subject: " + subject);
//				System.out.println("\t Sent Date: " + sentDate);
//				System.out.println("\t Message: " + messageContent);
//				System.out.println("\t Attachments: " + attachFiles);*/
//                }
//
//                // disconnect
//                folderInbox.close(false);
//                store.close();
//            } catch (NoSuchProviderException ex) {
//                System.out.println("No provider for pop3.");
//                ex.printStackTrace();
//                log.error(ex);
//            } catch (MessagingException ex) {
//                System.out.println("Could not connect to the message store");
//                ex.printStackTrace();
//                log.error(ex);
//            } catch (IOException ex) {
//                ex.printStackTrace();
//                log.error(ex);
//            }
//        }
//    }}
//
////	Runs this program with Gmail POP3 server
//   public void getSomthing(){
//        String host = "pop.gmail.com";
//        String port = "995";
//        String userName = "aaa@gmail.com"; //username for the mail you want to read
//        String password = "Everydfgfg"; //password
//
//        String saveDirectory = "/home/sdsf;
//
//        EmailAttachmentReceiver receiver = new EmailAttachmentReceiver();
//        receiver.setSaveDirectory(saveDirectory);
//        EmailAttachmentReceiver.downloadEmailAttachments(host, port, userName, password);
//
//        }}
//
