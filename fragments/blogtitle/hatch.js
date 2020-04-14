module.exports = {
    convert: function($, f) {
        f.bindPath($)
        f.mapField($.find('h1'), 'model.title')
    }
}