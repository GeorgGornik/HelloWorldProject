package gui;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.events.MouseMoveListener;
import org.eclipse.swt.events.MouseEvent;

public class MyFIrstGUIWindowII {

	protected Shell shlFwWindow;
	private Text vornameTF;
	private Label nachnameL;
	private Text nachnameTF;
	private Label strasseL;
	private Text strasseTF;
	private Label plzL;
	private Text plzTF;
	private Text ortTF;
	private Label hausnummerL;
	private Text hausnummerTF;
	private Button btnAbbrechen;
	private Label vornameOut;
	private Label nachnameOut;
	private Label strasseOut;
	private Label hausnummerOut;
	private Label plzOut;
	private Label ortOut;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MyFIrstGUIWindowII window = new MyFIrstGUIWindowII();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlFwWindow.open();
		shlFwWindow.layout();
		while (!shlFwWindow.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlFwWindow = new Shell();
		shlFwWindow.setBackground(SWTResourceManager.getColor(SWT.COLOR_DARK_BLUE));
		shlFwWindow.setSize(497, 419);
		shlFwWindow.setText("FR Window");
		
		Button btnNewButton = new Button(shlFwWindow, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			
			
			public void widgetSelected(SelectionEvent e) {
				System.out.println("Knoppe gedrückt");
				System.out.println(vornameTF.getText());
				System.out.println(nachnameTF.getText());
				System.out.println(strasseTF.getText());
				System.out.println(hausnummerTF.getText());
				System.out.println(plzTF.getText());
				System.out.println(ortTF.getText());
				//
				//System.out.println(getvornameTF.getText());
				getVornameOut().setText(getVornameTF().getText());
				getNachnameOut().setText(getNachnameTF().getText());
				getStrasseOut().setText(getStrasseTF().getText());
				getHausnummerOut().setText(getHausnummerTF().getText());
				getPlzOut().setText(getPlzTF().getText());
				getOrtOut().setText(getOrtTF().getText());
			}
		});
		btnNewButton.setBounds(74, 62, 75, 25);
		btnNewButton.setText("My Button");
		
		vornameTF = new Text(shlFwWindow, SWT.BORDER);
		vornameTF.setBounds(119, 99, 111, 21);
		
		Label vornameL = new Label(shlFwWindow, SWT.NONE);
		vornameL.setBounds(16, 102, 85, 15);
		vornameL.setText("Vorname");
		
		nachnameL = new Label(shlFwWindow, SWT.NONE);
		nachnameL.setBounds(16, 138, 85, 15);
		nachnameL.setText("Nachname");
		
		nachnameTF = new Text(shlFwWindow, SWT.BORDER);
		nachnameTF.setText("");
		nachnameTF.setBounds(119, 135, 112, 21);
		
		strasseL = new Label(shlFwWindow, SWT.NONE);
		strasseL.setBounds(16, 171, 85, 15);
		strasseL.setText("Stasse");
		
		strasseTF = new Text(shlFwWindow, SWT.BORDER);
		strasseTF.setBounds(119, 168, 111, 21);
		
		plzL = new Label(shlFwWindow, SWT.NONE);
		plzL.setBounds(16, 246, 85, 15);
		plzL.setText("PLZ");
		
		plzTF = new Text(shlFwWindow, SWT.BORDER);
		plzTF.setBounds(119, 243, 111, 21);
		
		Label ortL = new Label(shlFwWindow, SWT.NONE);
		ortL.setBounds(16, 283, 85, 15);
		ortL.setText("Ort");
		
		ortTF = new Text(shlFwWindow, SWT.BORDER);
		ortTF.setBounds(119, 280, 111, 21);
		
		hausnummerL = new Label(shlFwWindow, SWT.NONE);
		hausnummerL.setBounds(16, 204, 85, 15);
		hausnummerL.setText("Hausnummer");
		
		hausnummerTF = new Text(shlFwWindow, SWT.BORDER);
		hausnummerTF.setBounds(119, 201, 111, 21);
		
		btnAbbrechen = new Button(shlFwWindow, SWT.NONE);
		btnAbbrechen.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			System.exit(0);
			}
		});
		btnAbbrechen.setBounds(323, 62, 75, 25);
		btnAbbrechen.setText("abbrechen");
		
		Composite composite = new Composite(shlFwWindow, SWT.NONE);
		composite.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
		composite.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		composite.addMouseMoveListener(new MouseMoveListener() {
			public void mouseMove(MouseEvent me) {
				System.out.println(me .x + " / " + me.y);
			}
		});
		composite.setBounds(230, 306, 146, 64);
		
		vornameOut = new Label(shlFwWindow, SWT.NONE);
		vornameOut.setBounds(266, 99, 75, 24);
		
		nachnameOut = new Label(shlFwWindow, SWT.NONE);
		nachnameOut.setBounds(265, 129, 76, 24);
		
		strasseOut = new Label(shlFwWindow, SWT.NONE);
		strasseOut.setBounds(265, 168, 75, 25);
		
		hausnummerOut = new Label(shlFwWindow, SWT.NONE);
		hausnummerOut.setBounds(265, 201, 75, 25);
		
		plzOut = new Label(shlFwWindow, SWT.NONE);
		plzOut.setBounds(265, 243, 75, 21);
		
		ortOut = new Label(shlFwWindow, SWT.NONE);
		ortOut.setBounds(265, 280, 75, 21);
		shlFwWindow.setTabList(new Control[]{btnNewButton, vornameTF, nachnameTF, strasseTF, plzTF, ortTF, hausnummerTF});

	}
	public Text getVornameTF() {
		return vornameTF;
	}
	public Text getNachnameTF() {
		return nachnameTF;
	}
	public Text getStrasseTF() {
		return strasseTF;
	}
	public Text getHausnummerTF() {
		return hausnummerTF;
	}
	public Text getPlzTF() {
		return plzTF;
	}
	public Text getOrtTF() {
		return ortTF;
	}
	public Label getVornameOut() {
		return vornameOut;
	}
	public Label getNachnameOut() {
		return nachnameOut;
	}
	public Label getStrasseOut() {
		return strasseOut;
	}
	public Label getHausnummerOut() {
		return hausnummerOut;
	}
	public Label getPlzOut() {
		return plzOut;
	}
	public Label getOrtOut() {
		return ortOut;
	}
}
