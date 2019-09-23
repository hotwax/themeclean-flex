package com.themecleanflex.models;

import com.peregrine.nodetypes.models.AbstractComponent;
import com.peregrine.nodetypes.models.IComponent;
import com.peregrine.nodetypes.models.Container;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

/*
    //GEN[:DATA
    {
  "definitions": {
    "Cardthreeimages": {
      "type": "object",
      "x-type": "component",
      "properties": {
        "cards": {
          "type": "string",
          "x-source": "inject",
          "x-form-label": "Cards",
          "x-form-fieldLabel": "title",
          "x-form-type": "collection",
          "properties": {
            "title": {
              "type": "string",
              "x-source": "inject",
              "x-form-label": "Card Title",
              "x-form-type": "text"
            },
            "text": {
              "type": "string",
              "x-source": "inject",
              "x-form-label": "Card Text",
              "x-form-type": "texteditor"
            },
            "image": {
              "type": "string",
              "x-source": "inject",
              "x-form-label": "Card Image",
              "x-form-type": "pathbrowser",
              "x-form-browserRoot": "/content/assets"
            }
          }
        }
      }
    }
  },
  "name": "Cardthreeimages",
  "componentPath": "themecleanflex/components/cardthreeimages",
  "package": "com.themecleanflex.models",
  "modelName": "Cardthreeimages",
  "classNameParent": "AbstractComponent"
}
//GEN]
*/

//GEN[:DEF
@Model(
        adaptables = Resource.class,
        resourceType = "themecleanflex/components/cardthreeimages",
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
        adapters = IComponent.class
)
@Exporter(
        name = "jackson",
        extensions = "json"
)

//GEN]
public class CardthreeimagesModel extends AbstractComponent {

	public CardthreeimagesModel(Resource r) { super(r); }

	//GEN[:INJECT
    	/* {"type":"string","x-source":"inject","x-form-label":"Cards","x-form-fieldLabel":"title","x-form-type":"collection","properties":{"title":{"type":"string","x-source":"inject","x-form-label":"Card Title","x-form-type":"text"},"text":{"type":"string","x-source":"inject","x-form-label":"Card Text","x-form-type":"texteditor"},"image":{"type":"string","x-source":"inject","x-form-label":"Card Image","x-form-type":"pathbrowser","x-form-browserRoot":"/content/assets"}}} */
	@Inject
	private List<IComponent> cards;


//GEN]

	//GEN[:GETTERS
    	/* {"type":"string","x-source":"inject","x-form-label":"Cards","x-form-fieldLabel":"title","x-form-type":"collection","properties":{"title":{"type":"string","x-source":"inject","x-form-label":"Card Title","x-form-type":"text"},"text":{"type":"string","x-source":"inject","x-form-label":"Card Text","x-form-type":"texteditor"},"image":{"type":"string","x-source":"inject","x-form-label":"Card Image","x-form-type":"pathbrowser","x-form-browserRoot":"/content/assets"}}} */
	public List<IComponent> getCards() {
		return cards;
	}


//GEN]

	//GEN[:CUSTOMGETTERS
	//GEN]

}
