.class La/g/l/d0/d$b;
.super La/g/l/d0/d$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/g/l/d0/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# direct methods
.method constructor <init>(La/g/l/d0/d;)V
    .locals 0

    invoke-direct {p0, p1}, La/g/l/d0/d$a;-><init>(La/g/l/d0/d;)V

    return-void
.end method


# virtual methods
.method public findFocus(I)Landroid/view/accessibility/AccessibilityNodeInfo;
    .locals 1

    iget-object v0, p0, La/g/l/d0/d$a;->a:La/g/l/d0/d;

    invoke-virtual {v0, p1}, La/g/l/d0/d;->b(I)La/g/l/d0/c;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p1}, La/g/l/d0/c;->u()Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object p1

    return-object p1
.end method
