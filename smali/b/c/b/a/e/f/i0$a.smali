.class abstract Lb/c/b/a/e/f/i0$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/c/b/a/e/f/i0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x400
    name = "a"
.end annotation


# instance fields
.field final b:J

.field final c:J

.field private final d:Z

.field private final synthetic e:Lb/c/b/a/e/f/i0;


# direct methods
.method constructor <init>(Lb/c/b/a/e/f/i0;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lb/c/b/a/e/f/i0$a;-><init>(Lb/c/b/a/e/f/i0;Z)V

    return-void
.end method

.method constructor <init>(Lb/c/b/a/e/f/i0;Z)V
    .locals 2

    iput-object p1, p0, Lb/c/b/a/e/f/i0$a;->e:Lb/c/b/a/e/f/i0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lb/c/b/a/e/f/i0;->b:Lcom/google/android/gms/common/util/d;

    invoke-interface {v0}, Lcom/google/android/gms/common/util/d;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lb/c/b/a/e/f/i0$a;->b:J

    iget-object p1, p1, Lb/c/b/a/e/f/i0;->b:Lcom/google/android/gms/common/util/d;

    invoke-interface {p1}, Lcom/google/android/gms/common/util/d;->b()J

    move-result-wide v0

    iput-wide v0, p0, Lb/c/b/a/e/f/i0$a;->c:J

    iput-boolean p2, p0, Lb/c/b/a/e/f/i0$a;->d:Z

    return-void
.end method


# virtual methods
.method abstract a()V
.end method

.method protected b()V
    .locals 0

    return-void
.end method

.method public run()V
    .locals 4

    iget-object v0, p0, Lb/c/b/a/e/f/i0$a;->e:Lb/c/b/a/e/f/i0;

    invoke-static {v0}, Lb/c/b/a/e/f/i0;->a(Lb/c/b/a/e/f/i0;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lb/c/b/a/e/f/i0$a;->b()V

    return-void

    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lb/c/b/a/e/f/i0$a;->a()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lb/c/b/a/e/f/i0$a;->e:Lb/c/b/a/e/f/i0;

    const/4 v2, 0x0

    iget-boolean v3, p0, Lb/c/b/a/e/f/i0$a;->d:Z

    invoke-static {v1, v0, v2, v3}, Lb/c/b/a/e/f/i0;->a(Lb/c/b/a/e/f/i0;Ljava/lang/Exception;ZZ)V

    invoke-virtual {p0}, Lb/c/b/a/e/f/i0$a;->b()V

    return-void
.end method
