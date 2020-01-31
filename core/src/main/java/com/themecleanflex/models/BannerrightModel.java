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
    "Bannerright": {
      "type": "object",
      "x-type": "component",
      "properties": {
        "title": {
          "type": "string",
          "x-source": "inject",
          "x-form-label": "Title",
          "x-form-type": "text"
        },
        "bgref": {
          "x-form-type": "reference",
          "type": "object",
          "x-type": "component",
          "properties": {
            "image": {
              "type": "string",
              "x-source": "inject",
              "x-form-label": "Image",
              "x-form-type": "pathbrowser",
              "x-form-browserRoot": "/content/assets"
            }
          }
        },
        "link": {
          "type": "string",
          "x-source": "inject",
          "x-form-label": "Link",
          "x-form-internalLinkPlaceholder": "Link",
          "x-form-urlPlaceholder": "URL",
          "x-form-type": "inputlink",
          "x-form-browserRoot": "/content/sites"
        },
        "text": {
          "type": "string",
          "x-source": "inject",
          "x-form-label": "Text",
          "x-form-type": "texteditor"
        },
        "showbutton": {
          "type": "string",
          "x-source": "inject",
          "x-form-label": "Show Button",
          "x-form-type": "materialswitch"
        },
        "buttontext": {
          "type": "string",
          "x-source": "inject",
          "x-form-label": "Button Text",
          "x-form-visible": "model.showbutton == 'true'",
          "x-form-type": "text"
        },
        "buttonlink": {
          "type": "string",
          "x-source": "inject",
          "x-form-label": "Button Link",
          "x-form-internalLinkPlaceholder": "Link",
          "x-form-urlPlaceholder": "URL",
          "x-form-visible": "model.showbutton == 'true'",
          "x-form-type": "inputlink",
          "x-form-browserRoot": "/content/sites"
        },
        "linkType": {
          "type": "string",
          "x-source": "inject",
          "x-default": "internalLink",
          "x-form-visible": "false",
          "x-form-type": "text"
        },
        "imageLinkType": {
          "type": "string",
          "x-source": "inject",
          "x-default": "internalLink",
          "x-form-visible": "false",
          "x-form-type": "text"
        }
      }
    }
  },
  "name": "Bannerright",
  "componentPath": "themecleanflex/components/bannerright",
  "package": "com.themecleanflex.models",
  "modelName": "Bannerright",
  "classNameParent": "AbstractComponent"
}
//GEN]
*/

//GEN[:DEF
@Model(
        adaptables = Resource.class,
        resourceType = "themecleanflex/components/bannerright",
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
        adapters = IComponent.class
)
@Exporter(
        name = "jackson",
        extensions = "json"
)

//GEN]
public class BannerrightModel extends AbstractComponent {

    public BannerrightModel(Resource r) { super(r); }

    //GEN[:INJECT
    	/* {"type":"string","x-source":"inject","x-form-label":"Title","x-form-type":"text"} */
	@Inject
	private String title;

	/* {"type":"string","x-source":"inject","x-form-label":"Image","x-form-type":"pathbrowser","x-form-browserRoot":"/content/assets"} */
	@Inject
	private String image;

	/* {"type":"string","x-source":"inject","x-form-label":"Link","x-form-internalLinkPlaceholder":"Link","x-form-urlPlaceholder":"URL","x-form-type":"inputlink","x-form-browserRoot":"/content/sites"} */
	@Inject
	private String link;

	/* {"type":"string","x-source":"inject","x-form-label":"Text","x-form-type":"texteditor"} */
	@Inject
	private String text;

	/* {"type":"string","x-source":"inject","x-form-label":"Show Button","x-form-type":"materialswitch"} */
	@Inject
	private String showbutton;

	/* {"type":"string","x-source":"inject","x-form-label":"Button Text","x-form-visible":"model.showbutton == 'true'","x-form-type":"text"} */
	@Inject
	private String buttontext;

	/* {"type":"string","x-source":"inject","x-form-label":"Button Link","x-form-internalLinkPlaceholder":"Link","x-form-urlPlaceholder":"URL","x-form-visible":"model.showbutton == 'true'","x-form-type":"inputlink","x-form-browserRoot":"/content/sites"} */
	@Inject
	private String buttonlink;

	/* {"type":"string","x-source":"inject","x-default":"internalLink","x-form-visible":"false","x-form-type":"text"} */
	@Inject
	@Default(values ="internalLink")
	private String linkType;

	/* {"type":"string","x-source":"inject","x-default":"internalLink","x-form-visible":"false","x-form-type":"text"} */
	@Inject
	@Default(values ="internalLink")
  private String imageLinkType;
  
  @Inject
  @Default(values = "internalLink")
  private String buttonLinkType;


//GEN]

    //GEN[:GETTERS
    	/* {"type":"string","x-source":"inject","x-form-label":"Title","x-form-type":"text"} */
	public String getTitle() {
		return title;
	}

	/* {"type":"string","x-source":"inject","x-form-label":"Image","x-form-type":"pathbrowser","x-form-browserRoot":"/content/assets"} */
	public String getImage() {
		return image;
	}

	/* {"type":"string","x-source":"inject","x-form-label":"Link","x-form-internalLinkPlaceholder":"Link","x-form-urlPlaceholder":"URL","x-form-type":"inputlink","x-form-browserRoot":"/content/sites"} */
	public String getLink() {
		return link;
	}

	/* {"type":"string","x-source":"inject","x-form-label":"Text","x-form-type":"texteditor"} */
	public String getText() {
		return text;
	}

	/* {"type":"string","x-source":"inject","x-form-label":"Show Button","x-form-type":"materialswitch"} */
	public String getShowbutton() {
		return showbutton;
	}

	/* {"type":"string","x-source":"inject","x-form-label":"Button Text","x-form-visible":"model.showbutton == 'true'","x-form-type":"text"} */
	public String getButtontext() {
		return buttontext;
	}

	/* {"type":"string","x-source":"inject","x-form-label":"Button Link","x-form-internalLinkPlaceholder":"Link","x-form-urlPlaceholder":"URL","x-form-visible":"model.showbutton == 'true'","x-form-type":"inputlink","x-form-browserRoot":"/content/sites"} */
	public String getButtonlink() {
		return buttonlink;
	}

	/* {"type":"string","x-source":"inject","x-default":"internalLink","x-form-visible":"false","x-form-type":"text"} */
	public String getLinkType() {
		return linkType;
	}

	/* {"type":"string","x-source":"inject","x-default":"internalLink","x-form-visible":"false","x-form-type":"text"} */
	public String getImageLinkType() {
		return imageLinkType;
  }
  
  public String getButtonLinkType() {
    return buttonLinkType;
  }


//GEN]

    //GEN[:CUSTOMGETTERS
    //GEN]

}
