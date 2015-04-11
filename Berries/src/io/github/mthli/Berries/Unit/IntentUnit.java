package io.github.mthli.Berries.Unit;

import android.content.Context;
import android.content.Intent;
import android.net.MailTo;
import io.github.mthli.Berries.Database.Record;

public class IntentUnit {
    public static final String LIST = "LIST";
    public static final String QUIT = "QUIT";

    public static Intent getEmailIntent(MailTo mailTo) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL, new String[] { mailTo.getTo() });
        intent.putExtra(Intent.EXTRA_TEXT, mailTo.getBody());
        intent.putExtra(Intent.EXTRA_SUBJECT, mailTo.getSubject());
        intent.putExtra(Intent.EXTRA_CC, mailTo.getCc());
        intent.setType("message/rfc822");
        return intent;
    }

    public static void share(Context context, Record record) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, record.getTitle() + "\n" + record.getURL());
        context.startActivity(intent);
    }
}