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
		shlFwWindow.setBackground(SWTResourceManager.getColor(SWT.COLOR_INFO_BACKGROUND));
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
				
			}
		});
		btnNewButton.setBounds(74, 62, 75, 25);
		btnNewButton.setText("My Button");
		
		vornameTF = new Text(shlFwWindow, SWT.BORDER);
		vornameTF.setBounds(119, 99, 111, 21);
		
		Label vornameL = new Label(shlFwWindow, SWT.NONE);
		vornameL.setBounds(16, 102, 55, 15);
		vornameL.setText("Vorname");
		
		nachnameL = new Label(shlFwWindow, SWT.NONE);
		nachnameL.setBounds(16, 138, 65, 15);
		nachnameL.setText("Nachname");
		
		nachnameTF = new Text(shlFwWindow, SWT.BORDER);
		nachnameTF.setText("");
		nachnameTF.setBounds(119, 135, 112, 21);
		
		strasseL = new Label(shlFwWindow, SWT.NONE);
		strasseL.setBounds(16, 171, 55, 15);
		strasseL.setText("Stasse");
		
		strasseTF = new Text(shlFwWindow, SWT.BORDER);
		strasseTF.setBounds(119, 168, 111, 21);
		
		plzL = new Label(shlFwWindow, SWT.NONE);
		plzL.setBounds(20, 246, 55, 15);
		plzL.setText("PLZ");
		
		plzTF = new Text(shlFwWindow, SWT.BORDER);
		plzTF.setBounds(119, 243, 111, 21);
		
		Label ortL = new Label(shlFwWindow, SWT.NONE);
		ortL.setBounds(16, 283, 55, 15);
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
		composite.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
		composite.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		composite.addMouseMoveListener(new MouseMoveListener() {
			public void mouseMove(MouseEvent me) {
				System.out.println(me .x + " / " + me.y);
			}
		});
		composite.setBounds(287, 234, 146, 64);
		shlFwWindow.setTabList(new Control[]{btnNewButton, vornameTF, nachnameTF, strasseTF, plzTF, ortTF, hausnummerTF});

	}
}
