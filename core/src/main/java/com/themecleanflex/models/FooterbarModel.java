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
    "Footerbar": {
      "type": "object",
      "x-type": "component",
      "properties": {
        "columns": {
          "type": "string",
          "x-source": "inject",
          "x-form-label": "Columns",
          "x-form-type": "collection",
          "x-form-multifield": "true",
          "properties": {
            "title": {
              "type": "string",
              "x-source": "inject",
              "x-form-label": "Title",
              "x-form-type": "text"
            },
            "text": {
              "type": "string",
              "x-source": "inject",
              "x-form-label": "Text",
              "x-form-type": "texteditor"
            }
          }
        },
        "copyright": {
          "type": "string",
          "x-source": "inject",
          "x-form-label": "Copyright Text",
          "x-form-type": "text"
        },
        "icons": {
          "type": "object",
          "x-form-type": "collection",
          "x-form-label": "Icons",
          "x-source": "inject",
          "properties": {
            "icon": {
              "type": "string",
              "x-source": "inject",
              "x-form-label": "Icon Name",
              "x-form-type": "text"
            },
            "url": {
              "type": "string",
              "x-source": "inject",
              "x-form-label": "URL",
              "x-form-type": "url"
            },
            "iconalttext": {
              "type": "string",
              "x-source": "inject",
              "x-form-label": "Icon Alt Text",
              "x-form-type": "text"
            }
          }
        }
      }
    }
  },
  "name": "Footerbar",
  "componentPath": "themecleanflex/components/footerbar",
  "package": "com.themecleanflex.models",
  "modelName": "Footerbar",
  "classNameParent": "AbstractComponent"
}
//GEN]
*/

//GEN[:DEF
@Model(
        adaptables = Resource.class,
        resourceType = "themecleanflex/components/footerbar",
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
        adapters = IComponent.class
)
@Exporter(
        name = "jackson",
        extensions = "json"
)

//GEN]
public class FooterbarModel extends AbstractComponent {

    public FooterbarModel(Resource r) { super(r); }

    //GEN[:INJECT
    	/* {"type":"string","x-source":"inject","x-form-label":"Columns","x-form-type":"collection","x-form-multifield":"true","properties":{"title":{"type":"string","x-source":"inject","x-form-label":"Title","x-form-type":"text"},"text":{"type":"string","x-source":"inject","x-form-label":"Text","x-form-type":"texteditor"}}} */
	@Inject
	private List<IComponent> columns;

	/* {"type":"string","x-source":"inject","x-form-label":"Copyright Text","x-form-type":"text"} */
	@Inject
	private String copyright;

	/* {"type":"object","x-form-type":"collection","x-form-label":"Icons","x-source":"inject","properties":{"icon":{"type":"string","x-source":"inject","x-form-label":"Icon Name","x-form-type":"text"},"url":{"type":"string","x-source":"inject","x-form-label":"URL","x-form-type":"url"},"iconalttext":{"type":"string","x-source":"inject","x-form-label":"Icon Alt Text","x-form-type":"text"}}} */
	@Inject
	private List<IComponent> icons;


//GEN]

    //GEN[:GETTERS
    	/* {"type":"string","x-source":"inject","x-form-label":"Columns","x-form-type":"collection","x-form-multifield":"true","properties":{"title":{"type":"string","x-source":"inject","x-form-label":"Title","x-form-type":"text"},"text":{"type":"string","x-source":"inject","x-form-label":"Text","x-form-type":"texteditor"}}} */
	public List<IComponent> getColumns() {
		return columns;
	}

	/* {"type":"string","x-source":"inject","x-form-label":"Copyright Text","x-form-type":"text"} */
	public String getCopyright() {
		return copyright;
	}

	/* {"type":"object","x-form-type":"collection","x-form-label":"Icons","x-source":"inject","properties":{"icon":{"type":"string","x-source":"inject","x-form-label":"Icon Name","x-form-type":"text"},"url":{"type":"string","x-source":"inject","x-form-label":"URL","x-form-type":"url"},"iconalttext":{"type":"string","x-source":"inject","x-form-label":"Icon Alt Text","x-form-type":"text"}}} */
	public List<IComponent> getIcons() {
		return icons;
	}


//GEN]

    //GEN[:CUSTOMGETTERS
    //GEN]

}
