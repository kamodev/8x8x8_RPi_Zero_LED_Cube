package layout;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

import com.kamobagula.ledcube.R;

public class DlgPatternsFragment extends DialogFragment {

    public DlgPatternsFragment() {

    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(R.string.dlg_patterns_title)
               .setItems(R.array.cube_patterns, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {

                    }
               });
        return builder.create();
    }

}
