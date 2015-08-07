package com.edf.papyrus.moka.minizinc.opaqueactionexecution;

import org.eclipse.papyrus.moka.fuml.Semantics.Actions.BasicActions.ActionActivation;
import org.eclipse.papyrus.moka.fuml.Semantics.Classes.Kernel.StringValue;
import org.eclipse.papyrus.moka.fuml.Semantics.Classes.Kernel.Value;
import org.eclipse.uml2.uml.OpaqueAction;

public class OpaqueActionActivation extends ActionActivation {

	@Override
	public void doAction() {
		// TODO Auto-generated method stub
		Value value = null;
		OpaqueAction opaqueAction = (OpaqueAction)(this.node);
		if(opaqueAction.getInputValues().size() != 0){
			value = this.takeTokens(opaqueAction.getInputValues().get(0)).get(0);
		}
		else{
			value = new StringValue();
			((StringValue)value).value = "La valeur par defaut ра la sortie de OpaqueAction";
		}
		if(opaqueAction.getOutputValues().size() != 0)
			this.putToken(opaqueAction.getOutputValues().get(0), value);
	}
}
