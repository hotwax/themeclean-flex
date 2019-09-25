<template>
  <themecleanflex-components-block v-bind:model="model">
    <div class="p-5" v-if="isEditAndEmpty">no content defined for component</div>
    <div v-bind:class="{
            'md:flex-row': model.mediaposition === 'before',
            'md:flex-row-reverse': model.mediaposition === 'after'
        }" v-else>
      <h2 v-html="model.title"></h2>
      <div class="w-full flex flex-col md:-mx-3">
        <div class="img-wrapper mb-3 md:mb-0 md:px-3" v-html="model.text" v-if="model.showmedia === 'true'"
        v-bind:style="{flex:`0 0 ${model.mediawidth}%`}"></div>
        <div class="flex-grow md:px-3">richtext</div>
      </div>
    </div>
  </themecleanflex-components-block>
</template>

<script>
    export default {
        props: ['model'],
        computed: {
          isEditAndEmpty() {
              if(!$peregrineApp.isAuthorMode()) return false
              return this.$helper.areAllEmpty(this.model.text)
          }
        }
    }
</script>

