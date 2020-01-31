module.exports = {
    convert: function($, f) {
        f.bindPath($)
        //Text
        f.mapRichField($.find('h2').first(), "model.title")
        f.mapRichField($.find('p').first(), "model.text")

        //Buttons
        f.addIf($.find('a').first(), 'model.showbutton == \'true\'')
        f.mapRichField($.find('a').first(), "model.buttontext")
    }
}