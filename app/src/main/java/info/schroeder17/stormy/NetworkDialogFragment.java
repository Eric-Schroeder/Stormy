package info.schroeder17.stormy;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;

/**
 * Created by eric7078 on 26/03/15.
 */
public class NetworkDialogFragment extends DialogFragment{

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Context context = getActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder(context)
                .setTitle(context.getString(R.string.error_title))
                .setMessage(context.getString(R.string.network_message))
                .setPositiveButton(context.getString(R.string.error_button), null);

        AlertDialog network = builder.create();
        return network;
    }
}
