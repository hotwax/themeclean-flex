<template>
  <div v-bind:data-per-path="model.path">
    <p>{{model.text}}</p>
  </div>
</template>

<script>
    export default {
        props: ['model']
    }
</script>

