.class Lcom/google/android/material/datepicker/g$f;
.super La/g/l/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/datepicker/g;->a(Landroid/view/View;Lcom/google/android/material/datepicker/k;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/google/android/material/datepicker/g;


# direct methods
.method constructor <init>(Lcom/google/android/material/datepicker/g;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/datepicker/g$f;->d:Lcom/google/android/material/datepicker/g;

    invoke-direct {p0}, La/g/l/a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;La/g/l/d0/c;)V
    .locals 1

    invoke-super {p0, p1, p2}, La/g/l/a;->a(Landroid/view/View;La/g/l/d0/c;)V

    iget-object p1, p0, Lcom/google/android/material/datepicker/g$f;->d:Lcom/google/android/material/datepicker/g;

    invoke-static {p1}, Lcom/google/android/material/datepicker/g;->f(Lcom/google/android/material/datepicker/g;)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/google/android/material/datepicker/g$f;->d:Lcom/google/android/material/datepicker/g;

    sget v0, Lb/c/b/b/i;->mtrl_picker_toggle_to_year_selection:I

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/material/datepicker/g$f;->d:Lcom/google/android/material/datepicker/g;

    sget v0, Lb/c/b/b/i;->mtrl_picker_toggle_to_day_selection:I

    :goto_0
    invoke-virtual {p1, v0}, Landroidx/fragment/app/Fragment;->a(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, La/g/l/d0/c;->d(Ljava/lang/CharSequence;)V

    return-void
.end method
