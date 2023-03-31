.class public final enum Lcom/google/android/gms/internal/ads/fj1$a;
.super Ljava/lang/Enum;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/tz1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/ads/fj1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/android/gms/internal/ads/fj1$a;",
        ">;",
        "Lcom/google/android/gms/internal/ads/tz1;"
    }
.end annotation


# static fields
.field private static final enum c:Lcom/google/android/gms/internal/ads/fj1$a;

.field public static final enum d:Lcom/google/android/gms/internal/ads/fj1$a;

.field private static final synthetic e:[Lcom/google/android/gms/internal/ads/fj1$a;


# instance fields
.field private final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/google/android/gms/internal/ads/fj1$a;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const-string v3, "BLOCKED_REASON_UNKNOWN"

    invoke-direct {v0, v3, v1, v2}, Lcom/google/android/gms/internal/ads/fj1$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/ads/fj1$a;->c:Lcom/google/android/gms/internal/ads/fj1$a;

    new-instance v0, Lcom/google/android/gms/internal/ads/fj1$a;

    const/4 v3, 0x2

    const-string v4, "BLOCKED_REASON_BACKGROUND"

    invoke-direct {v0, v4, v2, v3}, Lcom/google/android/gms/internal/ads/fj1$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/ads/fj1$a;->d:Lcom/google/android/gms/internal/ads/fj1$a;

    new-array v3, v3, [Lcom/google/android/gms/internal/ads/fj1$a;

    sget-object v4, Lcom/google/android/gms/internal/ads/fj1$a;->c:Lcom/google/android/gms/internal/ads/fj1$a;

    aput-object v4, v3, v1

    aput-object v0, v3, v2

    sput-object v3, Lcom/google/android/gms/internal/ads/fj1$a;->e:[Lcom/google/android/gms/internal/ads/fj1$a;

    new-instance v0, Lcom/google/android/gms/internal/ads/jj1;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/jj1;-><init>()V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/google/android/gms/internal/ads/fj1$a;->b:I

    return-void
.end method

.method public static a(I)Lcom/google/android/gms/internal/ads/fj1$a;
    .locals 1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, Lcom/google/android/gms/internal/ads/fj1$a;->d:Lcom/google/android/gms/internal/ads/fj1$a;

    return-object p0

    :cond_1
    sget-object p0, Lcom/google/android/gms/internal/ads/fj1$a;->c:Lcom/google/android/gms/internal/ads/fj1$a;

    return-object p0
.end method

.method public static b()Lcom/google/android/gms/internal/ads/vz1;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/kj1;->a:Lcom/google/android/gms/internal/ads/vz1;

    return-object v0
.end method

.method public static values()[Lcom/google/android/gms/internal/ads/fj1$a;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/fj1$a;->e:[Lcom/google/android/gms/internal/ads/fj1$a;

    invoke-virtual {v0}, [Lcom/google/android/gms/internal/ads/fj1$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/ads/fj1$a;

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/fj1$a;->b:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "<"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-class v1, Lcom/google/android/gms/internal/ads/fj1$a;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " number="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/google/android/gms/internal/ads/fj1$a;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x3e

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
