.class final Lcom/google/android/gms/common/api/internal/f0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic b:Lcom/google/android/gms/common/api/internal/g0;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/internal/g0;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/f0;->b:Lcom/google/android/gms/common/api/internal/g0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/f0;->b:Lcom/google/android/gms/common/api/internal/g0;

    invoke-static {v0}, Lcom/google/android/gms/common/api/internal/g0;->a(Lcom/google/android/gms/common/api/internal/g0;)Lcom/google/android/gms/common/api/internal/h0;

    move-result-object v0

    new-instance v1, Lb/c/b/a/c/b;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, Lb/c/b/a/c/b;-><init>(I)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/common/api/internal/h0;->b(Lb/c/b/a/c/b;)V

    return-void
.end method
