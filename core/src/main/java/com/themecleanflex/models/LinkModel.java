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
    "Links": {
      "type": "object",
      "x-type": "component",
      "properties": {
        "title": {
          "type": "string",
          "x-source": "inject",
          "x-form-label": "Image Title",
          "x-form-type": "text"
        },
        "link": {
          "type": "string",
          "x-source": "inject",
          "x-form-label": "inputlink",
          "x-form-type": "inputlink",
          "x-form-browserRoot": "/context"
        }
      }
    }
  },
  "name": "Links",
  "componentPath": "themecleanflex/components/links",
  "package": "com.themecleanflex.models",
  "modelName": "Links",
  "classNameParent": "AbstractComponent"
}
//GEN]
*/

//GEN[:DEF
@Model(
        adaptables = Resource.class,
        resourceType = "themecleanflex/components/link",
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
        adapters = IComponent.class
)
@Exporter(
        name = "jackson",
        extensions = "json"
)

//GEN]
public class LinkModel extends AbstractComponent {

    public LinkModel(Resource r) { super(r); }

    //GEN[:INJECT
    	/* {"type":"string","x-source":"inject","x-form-label":"Image Title","x-form-type":"text"} */
	@Inject
	private String title;

	/* {"type":"string","x-source":"inject","x-form-label":"inputlink","x-form-type":"inputlink","x-form-browserRoot":"/context"} */
	@Inject
	private String link;


//GEN]

    //GEN[:GETTERS
    	/* {"type":"string","x-source":"inject","x-form-label":"Image Title","x-form-type":"text"} */
	public String getTitle() {
		return title;
	}

	/* {"type":"string","x-source":"inject","x-form-label":"inputlink","x-form-type":"inputlink","x-form-browserRoot":"/context"} */
	public String getLink() {
		return link;
	}


//GEN]

    //GEN[:CUSTOMGETTERS
    //GEN]

}
