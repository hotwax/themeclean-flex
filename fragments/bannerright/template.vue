<template>
  <themecleanflex-components-backgroundimage v-bind:model="model">
    <div class="p-5" v-if="isEditAndEmpty">no content defined for component</div>
    <div class="w-full flex flex-col justify-between items-center md:flex-row"
    v-else>
      <div class="text-right" style="margin-left: 40%;">
        <h2 v-html="model.title"></h2>
        <p v-html="model.text"></p>
        <br>
        <a href="#" class="btn m-2 btn-blue" style="backgroundColor: primary; borderColor:primary;"
        v-if="model.showbutton == 'true'" v-html="model.buttontext"></a>
      </div>
    </div>
  </themecleanflex-components-backgroundimage>
</template>

<script>
    export default {
        props: ['model']
    }
</script>

