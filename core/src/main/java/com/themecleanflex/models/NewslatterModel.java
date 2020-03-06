package com.themecleanflex.models;

import com.peregrine.nodetypes.models.AbstractComponent;
import com.peregrine.nodetypes.models.IComponent;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;

/*
    //GEN[:DATA
    {
  "definitions": {
    "Newslatter": {
      "type": "object",
      "x-type": "component",
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
        },
        "image": {
          "type": "string",
          "x-source": "inject",
          "x-form-label": "Image",
          "x-form-type": "pathbrowser",
          "x-form-browserRoot": "/content/assets"
        },
        "buttontext": {
          "type": "string",
          "x-source": "inject",
          "x-form-label": "Button text",
          "x-form-type": "text"
        },
        "buttonlink": {
          "type": "string",
          "x-source": "inject",
          "x-form-label": "Button Link",
          "x-form-internalLinkPlaceholder": "Link",
          "x-form-urlPlaceholder": "URL",
          "x-form-type": "buttonlinkfield",
          "x-form-browserRoot": "/content/sites"
        }
      }
    }
  },
  "name": "Newslatter",
  "componentPath": "themecleanflex/components/newslatter",
  "package": "com.themecleanflex.models",
  "modelName": "Newslatter",
  "classNameParent": "AbstractComponent"
}
//GEN]
*/

//GEN[:DEF
@Model(
        adaptables = Resource.class,
        resourceType = "themecleanflex/components/newslatter",
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
        adapters = IComponent.class
)
@Exporter(
        name = "jackson",
        extensions = "json"
)

//GEN]
public class NewslatterModel extends AbstractComponent {

    public NewslatterModel(Resource r) {
        super(r);
    }

    //GEN[:INJECT
    /* {"type":"string","x-source":"inject","x-form-label":"Title","x-form-type":"text"} */
    @Inject
    private String title;

    /* {"type":"string","x-source":"inject","x-form-label":"Text","x-form-type":"texteditor"} */
    @Inject
    private String text;

    /* {"type":"string","x-source":"inject","x-form-label":"Image","x-form-type":"pathbrowser","x-form-browserRoot":"/content/assets"} */
    @Inject
    private String image;

    /* {"type":"string","x-source":"inject","x-form-label":"Button text","x-form-type":"text"} */
    @Inject
    private String buttontext;

    /* {"type":"string","x-source":"inject","x-form-label":"Button Link","x-form-internalLinkPlaceholder":"Link","x-form-urlPlaceholder":"URL","x-form-type":"buttonlinkfield","x-form-browserRoot":"/content/sites"} */
    @Inject
    private String buttonlink;

    @Inject
    @Default(values = "internalLink")
    private String buttonLinkType;

    @Inject
    @Default(values = "internalLink")
    private String imageLinkType;


//GEN]

    //GEN[:GETTERS
    /* {"type":"string","x-source":"inject","x-form-label":"Title","x-form-type":"text"} */
    public String getTitle() {
        return title;
    }

    /* {"type":"string","x-source":"inject","x-form-label":"Text","x-form-type":"texteditor"} */
    public String getText() {
        return text;
    }

    /* {"type":"string","x-source":"inject","x-form-label":"Image","x-form-type":"pathbrowser","x-form-browserRoot":"/content/assets"} */
    public String getImage() {
        return image;
    }

    /* {"type":"string","x-source":"inject","x-form-label":"Button text","x-form-type":"text"} */
    public String getButtontext() {
        return buttontext;
    }

    /* {"type":"string","x-source":"inject","x-form-label":"Button Link","x-form-internalLinkPlaceholder":"Link","x-form-urlPlaceholder":"URL","x-form-type":"buttonlinkfield","x-form-browserRoot":"/content/sites"} */
    public String getButtonlink() {
        return buttonlink;
    }

    public String getButtonLinkType() {
        return buttonLinkType;
    }

    public String getImageLinkType() {
        return buttonLinkType;
    }


//GEN]

    //GEN[:CUSTOMGETTERS
    //GEN]

}
